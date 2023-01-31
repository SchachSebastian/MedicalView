import {useState} from 'react';
import {MapContainer, TileLayer, useMap} from 'react-leaflet';
import './MedicalMap.css';
import 'leaflet/dist/leaflet.css';

interface MedicalMapProps {
    coords: {
        latitude: number,
        longitude: number,
    },
    display_name: string;
}

function ChangeView() {
    const map = useMap();
    map.setView([1, 2], 13);
    return null;
}

export const MedicalMap = (props: MedicalMapProps) => {
    const [markers, setMarkers] = useState([
        {lat: 51.505, lng: -0.09, popup: 'Marker 1'},
        {lat: 51.506, lng: -0.09, popup: 'Marker 2'},
        {lat: 51.507, lng: -0.09, popup: 'Marker 3'},
    ]);
    const coords = [props.coords.latitude, props.coords.longitude];
    return (
        <MapContainer className={'map'}>
            <ChangeView/>
            <TileLayer
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            />
        </MapContainer>);
}
