package request;

public class NotesRequest {
    private String email;
    private String notes;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "NotesRequest{" +
                "email='" + email + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
