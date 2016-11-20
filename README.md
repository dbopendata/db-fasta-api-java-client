# Java Client for the DB Station Facilities Status (FaSta) API

This is a very simple Java client generated from the [FaSta API specification](https://developer.deutschebahn.com/store/api-docs/DBOpenData/FaSta-Station_Facilities_Status/v1) using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen).

# Usage

* Register on the [Deutsche Bahn API Portal}(https://developer.deutschebahn.com)
* Subscribe for the FaSta API
* Get your access token
* Create an API instance:  
```
DefaultApi api = new DefaultApiFactory().createApi(accessToken);
List<Facility> facilities = api.findFacilities(null, null, null, null, null);
```
* Call operations, for example:  
```
DefaultApi api = new DefaultApiFactory().createApi(accessToken);
List<Facility> facilities = api.findFacilities(null, null, null, null, null);
```

# License

[MIT license](LICENSE)

