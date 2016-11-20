package org.hisrc.fasta.client.v1.api.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.hisrc.fasta.client.v1.api.DefaultApi;
import org.hisrc.fasta.client.v1.invoker.ApiClient;
import org.hisrc.fasta.client.v1.invoker.ApiException;
import org.hisrc.fasta.client.v1.model.Facility;
import org.junit.Assert;
import org.junit.Test;

public class DefaultApiTest {

	@Test
	public void callsFacilities() throws ApiException, IOException {
		final Properties properties = new Properties();
		try (InputStream is = getClass().getResourceAsStream("/application.properties")) {
			properties.load(is);
		}
		final ApiClient apiClient = new ApiClient();
		apiClient.addDefaultHeader("Authorization", "Bearer " + properties.getProperty("fasta.accessToken"));
		final DefaultApi api = new DefaultApi(apiClient);
		final List<Facility> facilities = api.findFacilities(null, null, null, null, null);
		Assert.assertFalse(facilities.isEmpty());
	}

}
