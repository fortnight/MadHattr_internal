package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Hat;
import org.openapitools.client.model.NewHat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-21T12:10:29.716-04:00[America/New_York]")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a newHat
   * Creates a new instance of a &#x60;newHat&#x60;.
   * @param body A new &#x60;newHat&#x60; to be created. Ids will be generated and added to allow newHat to become a Hat object. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response. </td><td>  -  </td></tr>
     </table>
   */
  public void createNewHat(NewHat body) throws ApiException {
    createNewHatWithHttpInfo(body);
  }

  /**
   * Create a newHat
   * Creates a new instance of a &#x60;newHat&#x60;.
   * @param body A new &#x60;newHat&#x60; to be created. Ids will be generated and added to allow newHat to become a Hat object. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createNewHatWithHttpInfo(NewHat body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createNewHat");
    }
    
    // create path and map variables
    String localVarPath = "/hats";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("DefaultApi.createNewHat", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete a Hat
   * Deletes an existing &#x60;Hat&#x60;.
   * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful response. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteHat(String hatId) throws ApiException {
    deleteHatWithHttpInfo(hatId);
  }

  /**
   * Delete a Hat
   * Deletes an existing &#x60;Hat&#x60;.
   * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteHatWithHttpInfo(String hatId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hatId' is set
    if (hatId == null) {
      throw new ApiException(400, "Missing the required parameter 'hatId' when calling deleteHat");
    }
    
    // create path and map variables
    String localVarPath = "/hats/{hatId}"
      .replaceAll("\\{" + "hatId" + "\\}", apiClient.escapeString(hatId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("DefaultApi.deleteHat", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get a Hat
   * Gets the details of a single instance of a &#x60;Hat&#x60;.
   * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
   * @return Hat
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response - returns a single &#x60;Hat&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public Hat getHat(String hatId) throws ApiException {
    return getHatWithHttpInfo(hatId).getData();
  }

  /**
   * Get a Hat
   * Gets the details of a single instance of a &#x60;Hat&#x60;.
   * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
   * @return ApiResponse&lt;Hat&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response - returns a single &#x60;Hat&#x60;. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Hat> getHatWithHttpInfo(String hatId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'hatId' is set
    if (hatId == null) {
      throw new ApiException(400, "Missing the required parameter 'hatId' when calling getHat");
    }
    
    // create path and map variables
    String localVarPath = "/hats/{hatId}"
      .replaceAll("\\{" + "hatId" + "\\}", apiClient.escapeString(hatId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Hat> localVarReturnType = new GenericType<Hat>() {};

    return apiClient.invokeAPI("DefaultApi.getHat", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List All Hats
   * Gets a list of all &#x60;Hat&#x60; entities.
   * @return List&lt;Hat&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response - returns an array of &#x60;Hat&#x60; entities. </td><td>  -  </td></tr>
     </table>
   */
  public List<Hat> getHats() throws ApiException {
    return getHatsWithHttpInfo().getData();
  }

  /**
   * List All Hats
   * Gets a list of all &#x60;Hat&#x60; entities.
   * @return ApiResponse&lt;List&lt;Hat&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response - returns an array of &#x60;Hat&#x60; entities. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Hat>> getHatsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/hats";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Hat>> localVarReturnType = new GenericType<List<Hat>>() {};

    return apiClient.invokeAPI("DefaultApi.getHats", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a Hat
   * Updates an existing &#x60;Hat&#x60;.
   * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
   * @param body Updated &#x60;Hat&#x60; information. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Hat object properly updated. </td><td>  -  </td></tr>
     </table>
   */
  public void updateHat(String hatId, Hat body) throws ApiException {
    updateHatWithHttpInfo(hatId, body);
  }

  /**
   * Update a Hat
   * Updates an existing &#x60;Hat&#x60;.
   * @param hatId A unique identifier for a &#x60;Hat&#x60;. (required)
   * @param body Updated &#x60;Hat&#x60; information. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Hat object properly updated. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateHatWithHttpInfo(String hatId, Hat body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'hatId' is set
    if (hatId == null) {
      throw new ApiException(400, "Missing the required parameter 'hatId' when calling updateHat");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateHat");
    }
    
    // create path and map variables
    String localVarPath = "/hats/{hatId}"
      .replaceAll("\\{" + "hatId" + "\\}", apiClient.escapeString(hatId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("DefaultApi.updateHat", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
