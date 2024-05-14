package org.launchcode.codingevents.models;

import java.util.Objects;

import jakarta.validation.constraints.*;

public class Event {

    private int id;
    private static int nextId = 1;
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email.Try again.")
    private String contactEmail;

    @NotBlank(message = "Location cannot be left blank.")
    private String location;

    @AssertTrue(message = "Registration must be required at this time.")
      private boolean registration_required;

    @Positive(message = "Number of attendees must be one or more.")
    private int numberOfAttendees;

    public Event(String name, String description, String contactEmail, String location, boolean registration_required, int numberOfAttendees) {
            this();
            this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registration_required = registration_required;
        this.numberOfAttendees = numberOfAttendees;
//        this.id = nextId;
//        nextId++;
    }

    //No-arg constructor
    public Event(){
        this.id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistration_required() {
        return registration_required;
    }

    public void setRegistration_required(boolean registration_required) {
        this.registration_required = registration_required;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
       // if (!(o instanceof Event event)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
