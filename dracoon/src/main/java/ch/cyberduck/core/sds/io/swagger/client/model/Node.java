/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.EncryptionInfo;
import ch.cyberduck.core.sds.io.swagger.client.model.Node;
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/**
 * Node information (Node can be a room, folder or file)
 */
@Schema(description = "Node information (Node can be a room, folder or file)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class Node {
  @JsonProperty("id")
  private Long id = null;

  /**
   * Node type
   */
  public enum TypeEnum {
    ROOM("room"),
    FOLDER("folder"),
    FILE("file");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("timestampCreation")
  private DateTime timestampCreation = null;

  @JsonProperty("timestampModification")
  private DateTime timestampModification = null;

  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("parentPath")
  private String parentPath = null;

  @JsonProperty("createdAt")
  private DateTime createdAt = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("updatedAt")
  private DateTime updatedAt = null;

  @JsonProperty("updatedBy")
  private UserInfo updatedBy = null;

  @JsonProperty("expireAt")
  private DateTime expireAt = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("fileType")
  private String fileType = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  @JsonProperty("size")
  private Long size = null;

  /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential
   */
  public enum ClassificationEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

    private Integer value;

    ClassificationEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ClassificationEnum fromValue(Integer text) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("classification")
  private ClassificationEnum classification = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  @JsonProperty("inheritPermissions")
  private Boolean inheritPermissions = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("encryptionInfo")
  private EncryptionInfo encryptionInfo = null;

  @JsonProperty("cntDeletedVersions")
  private Integer cntDeletedVersions = null;

  @JsonProperty("cntComments")
  private Integer cntComments = null;

  @JsonProperty("cntDownloadShares")
  private Integer cntDownloadShares = null;

  @JsonProperty("cntUploadShares")
  private Integer cntUploadShares = null;

  @JsonProperty("recycleBinRetentionPeriod")
  private Integer recycleBinRetentionPeriod = null;

  @JsonProperty("hasActivitiesLog")
  private Boolean hasActivitiesLog = true;

  @JsonProperty("quota")
  private Long quota = null;

  @JsonProperty("isFavorite")
  private Boolean isFavorite = null;

  @JsonProperty("branchVersion")
  private Long branchVersion = null;

  @JsonProperty("mediaToken")
  private String mediaToken = null;

  @JsonProperty("isBrowsable")
  private Boolean isBrowsable = null;

  @JsonProperty("cntRooms")
  private Integer cntRooms = null;

  @JsonProperty("cntFolders")
  private Integer cntFolders = null;

  @JsonProperty("cntFiles")
  private Integer cntFiles = null;

  @JsonProperty("authParentId")
  private Long authParentId = null;

  @JsonProperty("cntChildren")
  private Integer cntChildren = null;

  @JsonProperty("hasRecycleBin")
  private Boolean hasRecycleBin = null;

  @JsonProperty("children")
  private List<Node> children = null;

  public Node id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID
   * @return id
  **/
  @Schema(required = true, description = "Node ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Node type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Node type
   * @return type
  **/
  @Schema(required = true, description = "Node type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Node name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @Schema(required = true, description = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node timestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the node was created on external file system
   * @return timestampCreation
  **/
  @Schema(description = "&#128640; Since v4.22.0  Time the node was created on external file system")
  public DateTime getTimestampCreation() {
    return timestampCreation;
  }

  public void setTimestampCreation(DateTime timestampCreation) {
    this.timestampCreation = timestampCreation;
  }

  public Node timestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Time the content of a node was last modified on external file system
   * @return timestampModification
  **/
  @Schema(description = "&#128640; Since v4.22.0  Time the content of a node was last modified on external file system")
  public DateTime getTimestampModification() {
    return timestampModification;
  }

  public void setTimestampModification(DateTime timestampModification) {
    this.timestampModification = timestampModification;
  }

  public Node parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent node ID (room or folder)
   * @return parentId
  **/
  @Schema(description = "Parent node ID (room or folder)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Node parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Parent node path  &#x60;/&#x60; if node is a root node (room)
   * @return parentPath
  **/
  @Schema(description = "Parent node path  `/` if node is a root node (room)")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public Node createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date
   * @return createdAt
  **/
  @Schema(description = "Creation date")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Node createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public Node updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Modification date
   * @return updatedAt
  **/
  @Schema(description = "Modification date")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Node updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @Schema(description = "")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Node expireAt(DateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration date
   * @return expireAt
  **/
  @Schema(description = "Expiration date")
  public DateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(DateTime expireAt) {
    this.expireAt = expireAt;
  }

  public Node hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * MD5 hash of file
   * @return hash
  **/
  @Schema(description = "MD5 hash of file")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Node fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * File type / extension (for files only)
   * @return fileType
  **/
  @Schema(description = "File type / extension (for files only)")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public Node mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * File media type (for files only)
   * @return mediaType
  **/
  @Schema(description = "File media type (for files only)")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public Node size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Node size in byte
   * @return size
  **/
  @Schema(description = "Node size in byte")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Node classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification ID:  * &#x60;1&#x60; - public  * &#x60;2&#x60; - internal  * &#x60;3&#x60; - confidential  * &#x60;4&#x60; - strictly confidential
   * @return classification
  **/
  @Schema(description = "Classification ID:  * `1` - public  * `2` - internal  * `3` - confidential  * `4` - strictly confidential")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public Node notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes
   * @return notes
  **/
  @Schema(description = "User notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Node permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }

  public Node inheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
    return this;
  }

   /**
   * Inherit permissions from parent room  (default: &#x60;false&#x60; if &#x60;parentId&#x60; is &#x60;0&#x60;; otherwise: &#x60;true&#x60;)
   * @return inheritPermissions
  **/
  @Schema(description = "Inherit permissions from parent room  (default: `false` if `parentId` is `0`; otherwise: `true`)")
  public Boolean isInheritPermissions() {
    return inheritPermissions;
  }

  public void setInheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
  }

  public Node isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Encryption state
   * @return isEncrypted
  **/
  @Schema(description = "Encryption state")
  public Boolean isIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public Node encryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
    return this;
  }

   /**
   * Get encryptionInfo
   * @return encryptionInfo
  **/
  @Schema(description = "")
  public EncryptionInfo getEncryptionInfo() {
    return encryptionInfo;
  }

  public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
  }

  public Node cntDeletedVersions(Integer cntDeletedVersions) {
    this.cntDeletedVersions = cntDeletedVersions;
    return this;
  }

   /**
   * Number of deleted versions of this file / folder  (for rooms / folders only)
   * @return cntDeletedVersions
  **/
  @Schema(description = "Number of deleted versions of this file / folder  (for rooms / folders only)")
  public Integer getCntDeletedVersions() {
    return cntDeletedVersions;
  }

  public void setCntDeletedVersions(Integer cntDeletedVersions) {
    this.cntDeletedVersions = cntDeletedVersions;
  }

  public Node cntComments(Integer cntComments) {
    this.cntComments = cntComments;
    return this;
  }

   /**
   * Returns the number of comments of this node.
   * @return cntComments
  **/
  @Schema(description = "Returns the number of comments of this node.")
  public Integer getCntComments() {
    return cntComments;
  }

  public void setCntComments(Integer cntComments) {
    this.cntComments = cntComments;
  }

  public Node cntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
    return this;
  }

   /**
   * Returns the number of Download Shares of this node.
   * @return cntDownloadShares
  **/
  @Schema(description = "Returns the number of Download Shares of this node.")
  public Integer getCntDownloadShares() {
    return cntDownloadShares;
  }

  public void setCntDownloadShares(Integer cntDownloadShares) {
    this.cntDownloadShares = cntDownloadShares;
  }

  public Node cntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
    return this;
  }

   /**
   * Returns the number of Upload Shares of this node.
   * @return cntUploadShares
  **/
  @Schema(description = "Returns the number of Upload Shares of this node.")
  public Integer getCntUploadShares() {
    return cntUploadShares;
  }

  public void setCntUploadShares(Integer cntUploadShares) {
    this.cntUploadShares = cntUploadShares;
  }

  public Node recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }

   /**
   * Retention period for deleted nodes in days
   * minimum: 0
   * maximum: 9999
   * @return recycleBinRetentionPeriod
  **/
  @Schema(description = "Retention period for deleted nodes in days")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }

  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }

  public Node hasActivitiesLog(Boolean hasActivitiesLog) {
    this.hasActivitiesLog = hasActivitiesLog;
    return this;
  }

   /**
   * Is activities log active (for rooms only)
   * @return hasActivitiesLog
  **/
  @Schema(description = "Is activities log active (for rooms only)")
  public Boolean isHasActivitiesLog() {
    return hasActivitiesLog;
  }

  public void setHasActivitiesLog(Boolean hasActivitiesLog) {
    this.hasActivitiesLog = hasActivitiesLog;
  }

  public Node quota(Long quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Quota in byte
   * @return quota
  **/
  @Schema(description = "Quota in byte")
  public Long getQuota() {
    return quota;
  }

  public void setQuota(Long quota) {
    this.quota = quota;
  }

  public Node isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Node is marked as favorite (for rooms / folders only)
   * @return isFavorite
  **/
  @Schema(description = "Node is marked as favorite (for rooms / folders only)")
  public Boolean isIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public Node branchVersion(Long branchVersion) {
    this.branchVersion = branchVersion;
    return this;
  }

   /**
   * Version of last change in this node or a node further down the tree.
   * @return branchVersion
  **/
  @Schema(description = "Version of last change in this node or a node further down the tree.")
  public Long getBranchVersion() {
    return branchVersion;
  }

  public void setBranchVersion(Long branchVersion) {
    this.branchVersion = branchVersion;
  }

  public Node mediaToken(String mediaToken) {
    this.mediaToken = mediaToken;
    return this;
  }

   /**
   * Media server media token
   * @return mediaToken
  **/
  @Schema(description = "Media server media token")
  public String getMediaToken() {
    return mediaToken;
  }

  public void setMediaToken(String mediaToken) {
    this.mediaToken = mediaToken;
  }

  public Node isBrowsable(Boolean isBrowsable) {
    this.isBrowsable = isBrowsable;
    return this;
  }

   /**
   * &amp;#128640; Since v4.11.0  Determines whether node is browsable by client (for rooms only)
   * @return isBrowsable
  **/
  @Schema(description = "&#128640; Since v4.11.0  Determines whether node is browsable by client (for rooms only)")
  public Boolean isIsBrowsable() {
    return isBrowsable;
  }

  public void setIsBrowsable(Boolean isBrowsable) {
    this.isBrowsable = isBrowsable;
  }

  public Node cntRooms(Integer cntRooms) {
    this.cntRooms = cntRooms;
    return this;
  }

   /**
   * &amp;#128640; Since v4.11.0  Amount of direct child rooms where this node is the parent node  (no recursion; for rooms only)
   * @return cntRooms
  **/
  @Schema(description = "&#128640; Since v4.11.0  Amount of direct child rooms where this node is the parent node  (no recursion; for rooms only)")
  public Integer getCntRooms() {
    return cntRooms;
  }

  public void setCntRooms(Integer cntRooms) {
    this.cntRooms = cntRooms;
  }

  public Node cntFolders(Integer cntFolders) {
    this.cntFolders = cntFolders;
    return this;
  }

   /**
   * &amp;#128640; Since v4.11.0  Amount of direct child folders where this node is the parent node  (no recursion; for rooms / folders only)
   * @return cntFolders
  **/
  @Schema(description = "&#128640; Since v4.11.0  Amount of direct child folders where this node is the parent node  (no recursion; for rooms / folders only)")
  public Integer getCntFolders() {
    return cntFolders;
  }

  public void setCntFolders(Integer cntFolders) {
    this.cntFolders = cntFolders;
  }

  public Node cntFiles(Integer cntFiles) {
    this.cntFiles = cntFiles;
    return this;
  }

   /**
   * &amp;#128640; Since v4.11.0  Amount of direct child files where this node is the parent node  (no recursion; for rooms / folders only)
   * @return cntFiles
  **/
  @Schema(description = "&#128640; Since v4.11.0  Amount of direct child files where this node is the parent node  (no recursion; for rooms / folders only)")
  public Integer getCntFiles() {
    return cntFiles;
  }

  public void setCntFiles(Integer cntFiles) {
    this.cntFiles = cntFiles;
  }

  public Node authParentId(Long authParentId) {
    this.authParentId = authParentId;
    return this;
  }

   /**
   * &amp;#128640; Since v4.15.0  Auth parent room ID
   * @return authParentId
  **/
  @Schema(description = "&#128640; Since v4.15.0  Auth parent room ID")
  public Long getAuthParentId() {
    return authParentId;
  }

  public void setAuthParentId(Long authParentId) {
    this.authParentId = authParentId;
  }

  public Node cntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.11.0  Number of direct children  (no recursion; for rooms / folders only)
   * @return cntChildren
  **/
  @Schema(description = "&#128679; Deprecated since v4.11.0  Number of direct children  (no recursion; for rooms / folders only)")
  public Integer getCntChildren() {
    return cntChildren;
  }

  public void setCntChildren(Integer cntChildren) {
    this.cntChildren = cntChildren;
  }

  public Node hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.10.0  Is recycle bin active (for rooms only)  Recycle bin is always on (disabling is not possible).
   * @return hasRecycleBin
  **/
  @Schema(description = "&#128679; Deprecated since v4.10.0  Is recycle bin active (for rooms only)  Recycle bin is always on (disabling is not possible).")
  public Boolean isHasRecycleBin() {
    return hasRecycleBin;
  }

  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }

  public Node children(List<Node> children) {
    this.children = children;
    return this;
  }

  public Node addChildrenItem(Node childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.10.0  Child nodes list (if requested)  (for rooms / folders only)
   * @return children
  **/
  @Schema(description = "&#128679; Deprecated since v4.10.0  Child nodes list (if requested)  (for rooms / folders only)")
  public List<Node> getChildren() {
    return children;
  }

  public void setChildren(List<Node> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.type, node.type) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.timestampCreation, node.timestampCreation) &&
        Objects.equals(this.timestampModification, node.timestampModification) &&
        Objects.equals(this.parentId, node.parentId) &&
        Objects.equals(this.parentPath, node.parentPath) &&
        Objects.equals(this.createdAt, node.createdAt) &&
        Objects.equals(this.createdBy, node.createdBy) &&
        Objects.equals(this.updatedAt, node.updatedAt) &&
        Objects.equals(this.updatedBy, node.updatedBy) &&
        Objects.equals(this.expireAt, node.expireAt) &&
        Objects.equals(this.hash, node.hash) &&
        Objects.equals(this.fileType, node.fileType) &&
        Objects.equals(this.mediaType, node.mediaType) &&
        Objects.equals(this.size, node.size) &&
        Objects.equals(this.classification, node.classification) &&
        Objects.equals(this.notes, node.notes) &&
        Objects.equals(this.permissions, node.permissions) &&
        Objects.equals(this.inheritPermissions, node.inheritPermissions) &&
        Objects.equals(this.isEncrypted, node.isEncrypted) &&
        Objects.equals(this.encryptionInfo, node.encryptionInfo) &&
        Objects.equals(this.cntDeletedVersions, node.cntDeletedVersions) &&
        Objects.equals(this.cntComments, node.cntComments) &&
        Objects.equals(this.cntDownloadShares, node.cntDownloadShares) &&
        Objects.equals(this.cntUploadShares, node.cntUploadShares) &&
        Objects.equals(this.recycleBinRetentionPeriod, node.recycleBinRetentionPeriod) &&
        Objects.equals(this.hasActivitiesLog, node.hasActivitiesLog) &&
        Objects.equals(this.quota, node.quota) &&
        Objects.equals(this.isFavorite, node.isFavorite) &&
        Objects.equals(this.branchVersion, node.branchVersion) &&
        Objects.equals(this.mediaToken, node.mediaToken) &&
        Objects.equals(this.isBrowsable, node.isBrowsable) &&
        Objects.equals(this.cntRooms, node.cntRooms) &&
        Objects.equals(this.cntFolders, node.cntFolders) &&
        Objects.equals(this.cntFiles, node.cntFiles) &&
        Objects.equals(this.authParentId, node.authParentId) &&
        Objects.equals(this.cntChildren, node.cntChildren) &&
        Objects.equals(this.hasRecycleBin, node.hasRecycleBin) &&
        Objects.equals(this.children, node.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, timestampCreation, timestampModification, parentId, parentPath, createdAt, createdBy, updatedAt, updatedBy, expireAt, hash, fileType, mediaType, size, classification, notes, permissions, inheritPermissions, isEncrypted, encryptionInfo, cntDeletedVersions, cntComments, cntDownloadShares, cntUploadShares, recycleBinRetentionPeriod, hasActivitiesLog, quota, isFavorite, branchVersion, mediaToken, isBrowsable, cntRooms, cntFolders, cntFiles, authParentId, cntChildren, hasRecycleBin, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timestampCreation: ").append(toIndentedString(timestampCreation)).append("\n");
    sb.append("    timestampModification: ").append(toIndentedString(timestampModification)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    inheritPermissions: ").append(toIndentedString(inheritPermissions)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    encryptionInfo: ").append(toIndentedString(encryptionInfo)).append("\n");
    sb.append("    cntDeletedVersions: ").append(toIndentedString(cntDeletedVersions)).append("\n");
    sb.append("    cntComments: ").append(toIndentedString(cntComments)).append("\n");
    sb.append("    cntDownloadShares: ").append(toIndentedString(cntDownloadShares)).append("\n");
    sb.append("    cntUploadShares: ").append(toIndentedString(cntUploadShares)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    hasActivitiesLog: ").append(toIndentedString(hasActivitiesLog)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    branchVersion: ").append(toIndentedString(branchVersion)).append("\n");
    sb.append("    mediaToken: ").append(toIndentedString(mediaToken)).append("\n");
    sb.append("    isBrowsable: ").append(toIndentedString(isBrowsable)).append("\n");
    sb.append("    cntRooms: ").append(toIndentedString(cntRooms)).append("\n");
    sb.append("    cntFolders: ").append(toIndentedString(cntFolders)).append("\n");
    sb.append("    cntFiles: ").append(toIndentedString(cntFiles)).append("\n");
    sb.append("    authParentId: ").append(toIndentedString(authParentId)).append("\n");
    sb.append("    cntChildren: ").append(toIndentedString(cntChildren)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
