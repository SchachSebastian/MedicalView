import React from 'react';
import './App.css';
import {MedicalMap} from './MedicalMap';

function App() {

    return (
        <div className="App">
            <MedicalMap coords={{latitude: 51.505, longitude: -0.09}} display_name='London'/>
        </div>
    );
}

export default App;
