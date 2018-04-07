package request;

public class NotesRequest {

    private String data;

    private String type;

    private Long userId;

    private Boolean deleted;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "NotesRequest{" +
                "data='" + data + '\'' +
                ", type='" + type + '\'' +
                ", userId=" + userId +
                ", deleted=" + deleted +
                '}';
    }
}
