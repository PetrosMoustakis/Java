package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import java.util.List;

public interface IMobileContactDao {

    /**
     * Inserts a new {@link MobileContact} instance in the datasource.
     * @param mobileContact         the model object that contains the mobile contact data
     * @return                      the resulting {@link MobileContact}
     */
    MobileContact insert(MobileContact mobileContact);

    /**
     * Updates a new {@link MobileContact} instance in the datasource.
     * @param mobileContact         the model object that contains the mobile contact data
     * @return                      the {@link MobileContact} instance before the update
     */
    MobileContact update (MobileContact mobileContact);

    /**
     * Removes a {@link MobileContact} instance from datasource
     * @param phoneNumber           the {@link MobileContact#phoneNumber} of the instance needed to be removed
     */
    void delete(String phoneNumber);
    void delete(Long id);

    /** Returns a {@link MobileContact} based on the input id
     * @param id                    the {@link MobileContact#id} of the instance to be return
     * @return                      the resulting {@link MobileContact}
     */
    MobileContact get(Long id);

    /** Returns a {@link MobileContact} based on the input phone Number
     * @param phoneNumber           the {@link MobileContact#phoneNumber} of the instance to be return
     * @return                      the resulting {@link MobileContact}
     */
    MobileContact get(String phoneNumber);

    /**
     * Return all the {@link MobileContact} instances from the datasource
     * @return                       the resulting {@link List < MobileContact}
    */
    List<MobileContact> getAll();

    /**
     * Checks if a phone number already exists as part of a {@link MobileContact}
     * @param phoneNumber           the <code>phoneNumber</code> to be searched for
     * @return                      true, if <code>phone number</code> exists in a {@link MobileContact} in the datasource
     */
    boolean phoneNumberExists(String phoneNumber);

    /**
     * Checks if an id already exists as part of a {@link MobileContact}
     * @param id           the <code>id</code> to be searched for
     * @return                      true, if <code>id</code> exists in a {@link MobileContact} in the datasource
     */
    boolean userIdExists(Long id);
}