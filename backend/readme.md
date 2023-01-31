# MedicalView

## REST Endpoints

| Endpoint       | Description           |
|----------------|-----------------------|
| /api/apotheken | List of all Apotheken |
| /api/arzt      | List of all Ärzte     |


## Arzt JSON Example

```json
{
  "aerzte": [
    {
      "geometry": {
        "coordinates": [
          16.313092126669034,
          48.20109388157836
        ],
        "type": "Point"
      },
      "geometry_name": "SHAPE",
      "id": "ARZTOGD.fid--5facc7bb_185f30cdeb5_-11fb",
      "properties": {
        "adresse": "14., Kienmayergasse 36/58",
        "fach": "Plastische, Rekonstruktive u. Ästhetische Chirurgie",
        "id": 8122833,
        "name": "Univ.Professor Dr. Gerald Zöch",
        "telefon": "+43 1 522 89 05",
        "url": "https://praxisplan.at/309/gerald-zoch/ordination/1"
      }
    },
    ...
  ],
  "totalFeatures": "7007"
}
```

## Apotheke JSON Example

```json
{
  "apotheken": [
    {
      "geometry": {
        "coordinates": [
          16.32756627633066,
          48.197960734553895
        ],
        "type": "Point"
      },
      "geometry_name": "SHAPE",
      "id": "APOTHEKEOGD.fid--5facc7bb_185f30cdeb5_-134a",
      "properties": {
        "adresse": "15., Märzstraße 49",
        "bezirk": 15,
        "email": "service@willkommens-apotheke.at",
        "fax": "01 982 54 05 50",
        "id": 1324547,
        "name": "Willkommens-Apotheke",
        "onr": "49",
        "strasse": "Märzstraße",
        "telefon": "01 982 54 05",
        "url": "http://www.willkommens-apotheke.at/"
      }
    },
    ...
  ],
  "totalFeatures": 335
}
```