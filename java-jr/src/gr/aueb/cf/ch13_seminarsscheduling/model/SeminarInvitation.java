package gr.aueb.cf.ch13_seminarsscheduling.model;

public class SeminarInvitation {
    private Message message;
    private Organizer sender;

    private SeminarInvitationType type;

    public SeminarInvitation() {}

    public Organizer getSender() {
        return sender;
    }

    public void setSender(Organizer sender) {
        this.sender = sender;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public SeminarInvitationType getType() {
        return type;
    }

    public void setType(SeminarInvitationType type) {
        this.type = type;
    }
}
