export default interface Aerzte {
    totalFeatures: number,
    aerzte: Aerzt[]
}

export interface Aerzt {
    id: string,
    geometry: {
        type: string,
        coordinates: number[]
    }
    geometry_name: string,
    properties: {
        id: number,
        name: string,
        adresse: string,
        fach: string,
        telefon: string,
        url: string
    }
}