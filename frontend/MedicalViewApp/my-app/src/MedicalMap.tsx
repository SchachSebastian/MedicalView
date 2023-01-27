import {useState} from 'react';
import {MapContainer, Marker, Popup, TileLayer, useMap} from 'react-leaflet';

interface MedicalMapProps {
    coords: {
        latitude: number,
        longitude: number,
    },
    display_name: string;
}

function MedicalMap(props: MedicalMapProps) {
    const [markers, setMarkers] = useState([
        {lat: 51.505, lng: -0.09, popup: 'Marker 1'},
        {lat: 51.506, lng: -0.09, popup: 'Marker 2'},
        {lat: 51.507, lng: -0.09, popup: 'Marker 3'},
    ]);

    function MapView() {
        let map = useMap();
        map.setView(props.coords, map.getZoom());
        //Sets geographical center and zoom for the view of the map
        return null;
    }

    return (
        <MapContainer bounds={props.coords} boundsOptions={13}>
            <TileLayer
                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a>contributors'
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            />
            {markers.map((marker, index) => (
                <Marker key={index} position={[marker.lat, marker.lng]}>
                    <Popup>{marker.popup}</Popup>
                </Marker>
            ))}
        </MapContainer>
    );
}
