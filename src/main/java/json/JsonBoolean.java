package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {

    public Boolean jBool;
    public JsonBoolean(Boolean bool) {
        this.jBool = bool;
    }

    @Override
    public String toJson() {
        return jBool.toString();
    }
}
