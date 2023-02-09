package gr.aueb.cf.ch18.mobilecontacts.service;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {

    /**
     * Creates a {@link MobileContact} based on the data carried by the {@link MobileContactDTO}.
     * @param mobileContactDTO          The DTO object that contains the mobile contact data.
     * @return                          The resulting {@link MobileContact}.
     * @throws PhoneNumberAlreadyExistsException    if the phone {@link MobileContact#phoneNumber} already exists in the datasource.
     * @throws UserIdAlreadyExistsException         if {@link MobileContact#id} already exists in the datasource.
     */
    MobileContact insertMobileContact(MobileContactDTO mobileContactDTO)
            throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    /**
     * Updated a {@link MobileContact} based on the data carried by the {@link MobileContactDTO}.
     * @param mobileContactDTO          The DTO object that contains the mobile contact data.
     * @return                          The resulting {@link MobileContact} before the update.
     * @throws PhoneNumberAlreadyExistsException    if the phone {@link MobileContact#phoneNumber} already exists in the datasource.
     * @throws ContactNotFoundException         if {@link MobileContactDTO#mobileContactId} does not map to a {@link MobileContact}
     *                                                                                                           in the datasource.
     */
    MobileContact updateMobileContact(MobileContactDTO mobileContactDTO)
            throws PhoneNumberAlreadyExistsException, ContactNotFoundException;

    /**
     * Removes a {@link MobileContact}.
     * @param phoneNumber                       the {@link MobileContact#phoneNumber} needed to be removed.
     * @throws ContactNotFoundException         if {@link MobileContactDTO#phoneNumber} does not map to a {@link MobileContact}
     *                                                                                                       in the datasource.
     */
    void deleteContact(String phoneNumber) throws ContactNotFoundException;

    /**
     * Returns the {@link MobileContact} based on the input phone number.
     * @param phoneNumber           The {@link MobileContact#phoneNumber} of the mobile contact instance needed to be returned.
     * @return                      The resulting {@link MobileContact}.
     * @throws ContactNotFoundException         if {@link MobileContactDTO#phoneNumber} does not map to a {@link MobileContact}
     *                                                                                                    in the datasource.
     */
    MobileContact getContact(String phoneNumber)
            throws ContactNotFoundException;

    /**
     * Returns the {@link MobileContact} based on the input id.
     * @param id           The {@link MobileContact#id} of the mobile contact instance needed to be returned.
     * @return                      The resulting {@link MobileContact}.
     * @throws ContactNotFoundException         if {@link MobileContact#id} does not map to a {@link MobileContact}
     *                                                                                           in the datasource.
     */
    MobileContact getContact(Long id)
            throws ContactNotFoundException;

    /**
     * Returns all the {@link MobileContact} instances of the datasource
     * @return          the resulting {@link List<MobileContact>.}
     */

    List<MobileContact> getAllContacts();

}