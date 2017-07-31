package Application.service.Converter;

import org.modelmapper.ModelMapper;

/**
 * Abstract Model Converter with common functionality
 *
 * @param <A>
 *            Api Model Type parameter
 * @param <D>
 *            Domain Model Type parameter
 */
public abstract class AbstractModelConverter<A, D> {

    // Thread Safe instance
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    /**
     * Convert a Domain Model to an Api Model instance
     *
     * @param domainModel
     *            the Domain Model instance
     * @param apiClass
     *            the Api Model Class
     *
     * @return the Api Model instance
     */
    public A toApiModel(D domainModel, Class<A> apiClass) {

        if (domainModel != null) {

            return MODEL_MAPPER.map(domainModel, apiClass);

        } else {

            return null;
        }
    }

    /**
     * Convert an Api Model to a Domain Model instance
     *
     * @param apiModel
     *            the Api Model instance
     * @param domainClass
     *            the Domain Model Class
     *
     * @return the Domain Model instance
     */
    public D toDomainModel(A apiModel, Class<D> domainClass) {

        if (apiModel != null) {

            return MODEL_MAPPER.map(apiModel, domainClass);

        } else {

            return null;
        }
    }
}
