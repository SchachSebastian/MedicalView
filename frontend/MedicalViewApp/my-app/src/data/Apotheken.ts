export default interface Apotheken {
    totalFeatures: number,
    apotheken: Apotheke[]
}

export interface Apotheke {
    id: string,
    geometry: {
        type: string,
        coordinates: number[]
    },
    geometry_name: string,
    properties: {
        id: number,
        name: string,
        bezirk: number,
        strasse: string,
        onr: string,
        adresse: string,
        telefon: string,
        fax: string,
        email: string,
        url: string
    }
}