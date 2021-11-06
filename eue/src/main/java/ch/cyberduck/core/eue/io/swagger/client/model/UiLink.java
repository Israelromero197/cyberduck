/*
 * ReSTFS
 * ReSTFS Open API 3.0 Spec
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.eue.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * UiLink
 */


public class UiLink {
  @JsonProperty("downloadURI")
  private String downloadURI = null;

  @JsonProperty("thumbnailURL")
  private String thumbnailURL = null;

  public UiLink downloadURI(String downloadURI) {
    this.downloadURI = downloadURI;
    return this;
  }

   /**
   * Get downloadURI
   * @return downloadURI
  **/
  @Schema(description = "")
  public String getDownloadURI() {
    return downloadURI;
  }

  public void setDownloadURI(String downloadURI) {
    this.downloadURI = downloadURI;
  }

  public UiLink thumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
    return this;
  }

   /**
   * Get thumbnailURL
   * @return thumbnailURL
  **/
  @Schema(description = "")
  public String getThumbnailURL() {
    return thumbnailURL;
  }

  public void setThumbnailURL(String thumbnailURL) {
    this.thumbnailURL = thumbnailURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiLink uiLink = (UiLink) o;
    return Objects.equals(this.downloadURI, uiLink.downloadURI) &&
        Objects.equals(this.thumbnailURL, uiLink.thumbnailURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadURI, thumbnailURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiLink {\n");
    
    sb.append("    downloadURI: ").append(toIndentedString(downloadURI)).append("\n");
    sb.append("    thumbnailURL: ").append(toIndentedString(thumbnailURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
