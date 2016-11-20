package org.hisrc.fasta.client.v1.api;

import org.hisrc.fasta.client.v1.invoker.ApiClient;

public class DefaultApiFactory {

	public DefaultApi createApi(String accessToken) {
		final ApiClient apiClient = new ApiClient();
		apiClient.addDefaultHeader("Authorization", "Bearer " + accessToken);
		final DefaultApi api = new DefaultApi(apiClient);
		return api;
	}
}
