package gr.aueb.cf.ch18.mobilecontacts.service.exceptions;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

public class UserIdAlreadyExistsException extends Exception {
    private final static long serialVersionUID = 1L;

    public UserIdAlreadyExistsException(MobileContact mobileContact) {
        super("Mobile Contact with user ID: " +
                mobileContact.getId() + " already exists.");
    }
}
