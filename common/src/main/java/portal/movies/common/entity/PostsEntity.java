package portal.movies.common.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "posts", schema = "movies_portal", catalog = "")
public class PostsEntity {
    private long postId;
    private Long postAuthor;
    private Timestamp postDate;
    private Timestamp postDateGmt;
    private String postContent;
    private String postTitle;
    private String postExcept;
    private Integer postStatus;
    private String postPassword;
    private Integer commentStatus;
    private Timestamp postModified;
    private Timestamp postModifiedGmt;
    private Long postModifiedBy;
    private Long commentCount;
    private Integer postType;
    private String postUrl;
    private Long numOfPart;

    @Id
    @Column(name = "post_id", nullable = false)
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "post_author", nullable = true)
    public Long getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }

    @Basic
    @Column(name = "post_date", nullable = true)
    public Timestamp getPostDate() {
        return postDate;
    }

    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }

    @Basic
    @Column(name = "post_date_gmt", nullable = true)
    public Timestamp getPostDateGmt() {
        return postDateGmt;
    }

    public void setPostDateGmt(Timestamp postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    @Basic
    @Column(name = "post_content", nullable = true, length = -1)
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Basic
    @Column(name = "post_title", nullable = true, length = -1)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Basic
    @Column(name = "post_except", nullable = true, length = -1)
    public String getPostExcept() {
        return postExcept;
    }

    public void setPostExcept(String postExcept) {
        this.postExcept = postExcept;
    }

    @Basic
    @Column(name = "post_status", nullable = true)
    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }

    @Basic
    @Column(name = "post_password", nullable = true, length = 255)
    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    @Basic
    @Column(name = "comment_status", nullable = true)
    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    @Basic
    @Column(name = "post_modified", nullable = true)
    public Timestamp getPostModified() {
        return postModified;
    }

    public void setPostModified(Timestamp postModified) {
        this.postModified = postModified;
    }

    @Basic
    @Column(name = "post_modified_gmt", nullable = true)
    public Timestamp getPostModifiedGmt() {
        return postModifiedGmt;
    }

    public void setPostModifiedGmt(Timestamp postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    @Basic
    @Column(name = "post_modified_by", nullable = true)
    public Long getPostModifiedBy() {
        return postModifiedBy;
    }

    public void setPostModifiedBy(Long postModifiedBy) {
        this.postModifiedBy = postModifiedBy;
    }

    @Basic
    @Column(name = "comment_count", nullable = true)
    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    @Basic
    @Column(name = "post_type", nullable = true)
    public Integer getPostType() {
        return postType;
    }

    public void setPostType(Integer postType) {
        this.postType = postType;
    }

    @Basic
    @Column(name = "post_url", nullable = true, length = 250)
    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    @Basic
    @Column(name = "num_of_part", nullable = true)
    public Long getNumOfPart() {
        return numOfPart;
    }

    public void setNumOfPart(Long numOfPart) {
        this.numOfPart = numOfPart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostsEntity that = (PostsEntity) o;

        if (postId != that.postId) return false;
        if (postAuthor != null ? !postAuthor.equals(that.postAuthor) : that.postAuthor != null) return false;
        if (postDate != null ? !postDate.equals(that.postDate) : that.postDate != null) return false;
        if (postDateGmt != null ? !postDateGmt.equals(that.postDateGmt) : that.postDateGmt != null) return false;
        if (postContent != null ? !postContent.equals(that.postContent) : that.postContent != null) return false;
        if (postTitle != null ? !postTitle.equals(that.postTitle) : that.postTitle != null) return false;
        if (postExcept != null ? !postExcept.equals(that.postExcept) : that.postExcept != null) return false;
        if (postStatus != null ? !postStatus.equals(that.postStatus) : that.postStatus != null) return false;
        if (postPassword != null ? !postPassword.equals(that.postPassword) : that.postPassword != null) return false;
        if (commentStatus != null ? !commentStatus.equals(that.commentStatus) : that.commentStatus != null)
            return false;
        if (postModified != null ? !postModified.equals(that.postModified) : that.postModified != null) return false;
        if (postModifiedGmt != null ? !postModifiedGmt.equals(that.postModifiedGmt) : that.postModifiedGmt != null)
            return false;
        if (postModifiedBy != null ? !postModifiedBy.equals(that.postModifiedBy) : that.postModifiedBy != null)
            return false;
        if (commentCount != null ? !commentCount.equals(that.commentCount) : that.commentCount != null) return false;
        if (postType != null ? !postType.equals(that.postType) : that.postType != null) return false;
        if (postUrl != null ? !postUrl.equals(that.postUrl) : that.postUrl != null) return false;
        if (numOfPart != null ? !numOfPart.equals(that.numOfPart) : that.numOfPart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (postAuthor != null ? postAuthor.hashCode() : 0);
        result = 31 * result + (postDate != null ? postDate.hashCode() : 0);
        result = 31 * result + (postDateGmt != null ? postDateGmt.hashCode() : 0);
        result = 31 * result + (postContent != null ? postContent.hashCode() : 0);
        result = 31 * result + (postTitle != null ? postTitle.hashCode() : 0);
        result = 31 * result + (postExcept != null ? postExcept.hashCode() : 0);
        result = 31 * result + (postStatus != null ? postStatus.hashCode() : 0);
        result = 31 * result + (postPassword != null ? postPassword.hashCode() : 0);
        result = 31 * result + (commentStatus != null ? commentStatus.hashCode() : 0);
        result = 31 * result + (postModified != null ? postModified.hashCode() : 0);
        result = 31 * result + (postModifiedGmt != null ? postModifiedGmt.hashCode() : 0);
        result = 31 * result + (postModifiedBy != null ? postModifiedBy.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        result = 31 * result + (postType != null ? postType.hashCode() : 0);
        result = 31 * result + (postUrl != null ? postUrl.hashCode() : 0);
        result = 31 * result + (numOfPart != null ? numOfPart.hashCode() : 0);
        return result;
    }
}
