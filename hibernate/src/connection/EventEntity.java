package connection;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "event", schema = "hackaton", catalog = "")
public class EventEntity {
    private int idEvent;
    private String eventTitle;
    private String eventDescription;
    private Date eventDate;

    @Id
    @Column(name = "idEvent")
    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Basic
    @Column(name = "eventTitle")
    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    @Basic
    @Column(name = "eventDescription")
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Basic
    @Column(name = "eventDate")
    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return idEvent == that.idEvent &&
                Objects.equals(eventTitle, that.eventTitle) &&
                Objects.equals(eventDescription, that.eventDescription) &&
                Objects.equals(eventDate, that.eventDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idEvent, eventTitle, eventDescription, eventDate);
    }
}
