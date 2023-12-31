package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object name
     
    /**
     * <p></p>
     */
    public static Object country
     
    /**
     * <p></p>
     */
    public static Object city
     
    /**
     * <p></p>
     */
    public static Object credit_card
     
    /**
     * <p></p>
     */
    public static Object month
     
    /**
     * <p></p>
     */
    public static Object year
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            name = selectedVariables['name']
            country = selectedVariables['country']
            city = selectedVariables['city']
            credit_card = selectedVariables['credit_card']
            month = selectedVariables['month']
            year = selectedVariables['year']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
