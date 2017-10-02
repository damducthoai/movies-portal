package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "files", schema = "movies_portal", catalog = "")
public class FilesEntity {
    private long fileId;
    private String fileTitle;
    private Integer fileType;
    private String fileDescription;
    private String fileName;
    private Long createdBy;
    private Long modifiedBy;
    private Long thumnailId;
    private Integer fileStatus;

    @Id
    @Column(name = "file_id", nullable = false)
    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "file_title", nullable = true, length = 255)
    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    @Basic
    @Column(name = "file_type", nullable = true)
    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    @Basic
    @Column(name = "file_description", nullable = true, length = -1)
    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    @Basic
    @Column(name = "file_name", nullable = true, length = 255)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "created_by", nullable = true)
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "modified_by", nullable = true)
    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "thumnail_id", nullable = true)
    public Long getThumnailId() {
        return thumnailId;
    }

    public void setThumnailId(Long thumnailId) {
        this.thumnailId = thumnailId;
    }

    @Basic
    @Column(name = "file_status", nullable = true)
    public Integer getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(Integer fileStatus) {
        this.fileStatus = fileStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilesEntity that = (FilesEntity) o;

        if (fileId != that.fileId) return false;
        if (fileTitle != null ? !fileTitle.equals(that.fileTitle) : that.fileTitle != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;
        if (fileDescription != null ? !fileDescription.equals(that.fileDescription) : that.fileDescription != null)
            return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
        if (thumnailId != null ? !thumnailId.equals(that.thumnailId) : that.thumnailId != null) return false;
        if (fileStatus != null ? !fileStatus.equals(that.fileStatus) : that.fileStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (fileId ^ (fileId >>> 32));
        result = 31 * result + (fileTitle != null ? fileTitle.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + (fileDescription != null ? fileDescription.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        result = 31 * result + (thumnailId != null ? thumnailId.hashCode() : 0);
        result = 31 * result + (fileStatus != null ? fileStatus.hashCode() : 0);
        return result;
    }
}
