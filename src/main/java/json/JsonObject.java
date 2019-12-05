package json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    public ArrayList<JsonPair> theJson;

    public JsonObject(JsonPair... jsonPairs) {
        this.theJson = new ArrayList<>();
        Collections.addAll(theJson, jsonPairs);
    }

    @Override
    public String toJson() {
        String fin = "";
        int counter = 0;
        for (JsonPair p : theJson) {
            if (counter > 0) fin += ",";
            fin += p.key + ":" + p.value.toJson();
            counter += 1;
        }
        return "{" + fin + "}";
    }

    public boolean contains(JsonPair newPair) {
        for (JsonPair p : theJson) {
            if (p.key.equals(newPair.key) && p.value.equals(newPair.value)) return true;
        }
        return false;
    }

    public void add(JsonPair jsonPair) {
        if (!(contains(jsonPair))) {
            for (JsonPair p : theJson) {
                if (p.key.equals(jsonPair.key)) {
                    p = jsonPair;
                    break;
                }
            }
            theJson.add(jsonPair);
        }
    }

    public Json find(String name) {
        for (JsonPair p : theJson) {
            if (p.key.equals(name)) return p.value;
        }
        return null;
    }

    public JsonObject projection(String... names) {
        JsonObject newJson = new JsonObject();
        for (String n : names) {
            Json v = find(n);
            if (v != null) newJson.add(new JsonPair(n, v));
        }
        return newJson;
    }
}
