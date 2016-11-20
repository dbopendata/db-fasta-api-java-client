# Java Client for the DB Station Facilities Status (FaSta) API

This is a very simple Java client generated from the [FaSta API specification](https://developer.deutschebahn.com/store/api-docs/DBOpenData/FaSta-Station_Facilities_Status/v1) using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen).

# Usage

* Register on the [Deutsche Bahn API Portal}(https://developer.deutschebahn.com)
* Subscribe for the FaSta API
* Get your access token
* Create an API instance:  
```
DefaultApi api = new DefaultApiFactory().createApi(accessToken);
```
* Call operations:  
```java
List<Facility> inactiveElevatorFacilities = api.findFacilities(
	Arrays.asList("ELEVATOR"), Arrays.asList("INACTIVE"), null, null, null);

Facility escalator_ZuGleis10_11_Berlin_Ostbahnhof = api.getFacilityByEquipmentNumber(10441811L);

Station station_Berlin_Ostbahnhof = api.findStationByStationNumber(530L);

List<Disruption> disruptions = api.findDisruptions(null, null, null);

Disruption disruption = api.findDisruptionByDisruptionNumber(11694554L);
```

# License

[MIT license](LICENSE)

