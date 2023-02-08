import {useEffect, useMemo, useState} from 'react';
import {MapContainer, Marker, Popup, TileLayer, useMap} from 'react-leaflet';
import './MedicalMap.css';
import 'leaflet/dist/leaflet.css';
import Aerzte, {Aerzt} from "./data/Aerzte";
import {url} from './GLOBALS';

interface MedicalMapProps {
}

function ChangeView() {
    const map = useMap();
    map.setView([1, 2], 2);
    map.preferCanvas = true;
    return null;
}

export const MedicalMap = (props: MedicalMapProps) => {
    const [aerzte, setAerzte] = useState<Aerzt[]>([]);
    useEffect(() => {
        fetch(`${url}/api/arzt`,).then(response => response.json()).then(data => {
            setAerzte((data as Aerzte).aerzte);
            console.log(data);
        });
    }, []);
    const coords = [0, 0];
    const markers = useMemo(() => {
        return aerzte.slice(0, 10).map((aerzt, index) => {
            return (
                <Marker key={index} position={aerzt.geometry.coordinates}>
                    <Popup>
                        <AerztPopup aerzt={aerzt}/>
                    </Popup>
                </Marker>
            );
        })
    }, [aerzte]);
    return (
        <MapContainer className={'map'}>
            <ChangeView/>
            <TileLayer
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            />
            {markers}
        </MapContainer>);
}
const AerztPopup = (props: { aerzt: Aerzt }) => {
    return (
        <div>
            <h1>{props.aerzt.properties.name}</h1>
            <p>{props.aerzt.properties.adresse}</p>
            <p>{props.aerzt.properties.fach}</p>
            <p>{props.aerzt.properties.telefon}</p>
            <a href={props.aerzt.properties.url}>{props.aerzt.properties.url}</a>
        </div>
    );
}
