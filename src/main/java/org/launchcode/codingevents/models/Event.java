package org.launchcode.codingevents.models;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Event extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;
   // private static int nextId = 1;
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private EventDetails eventDetails;

//    @Size(max = 500, message = "Description too long!")
//    private String description;
//
//    @NotBlank(message = "Email is required")
//    @Email(message = "Invalid Email.Try again.")
//    private String contactEmail;

  //  private EventType type;
    @ManyToOne
    @NotNull(message = "Category is required")
    private EventCategory eventCategory;

    @ManyToMany
    private final List<Tag> tags = new ArrayList<>();

//    public String getContactEmail() {
//        return contactEmail;
//    }
//
//    public void setContactEmail(String contactEmail) {
//        this.contactEmail = contactEmail;
//    }

    public Event(String name, EventCategory eventCategory) {
    //public Event(String name, String description, String contactEmail, EventCategory eventCategory) {
       //  public Event(String name, String description, String contactEmail, EventType type) {
       // this();
        this.name = name;
//        this.description = description;
//        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
        //this.type = type;
//        this.id = nextId;
//        nextId++;
    }

    //No-arg constructor
    public Event(){
//        this.id = nextId;
//        nextId++;
    }
//    public int getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }
//    public EventType getType() {
//        return type;
//    }
//
//    public void setType(EventType type) {
//        this.type = type;
//    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

//    public String getDescription() {
//        return description;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public List<Tag> getTags() {
        return tags;
    }

    public void addTag(Tag tag){
        this.tags.add(tag);
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//       // if (!(o instanceof Event event)) return false;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
