package consul;

import org.json.JSONObject;

public class KV {
    Integer createIndex;
    Integer modifyIndex;
    Integer lockIndex;
    String key;
    Integer flags;
    String value;

    public KV() {

    }

    public KV(Integer createIndex, Integer modifyIndex, Integer lockIndex, String key,
                    Integer flags, String value) {
        this.createIndex = createIndex;
        this.modifyIndex = modifyIndex;
        this.lockIndex = lockIndex;
        this.key = key;
        this.flags = flags;
        this.value = value;
    }

    KV(JSONObject obj) {
        this.createIndex = obj.optInt("CreateIndex");
        this.modifyIndex = obj.optInt("ModifyIndex");
        this.lockIndex = obj.optInt("LockIndex");
        this.key = obj.optString("Key");
        this.flags = obj.optInt("Flags");
        this.value = obj.optString("Value");
    }

    public Integer getCreateIndex() {
        return createIndex;
    }

    public void setCreateIndex(Integer createIndex) {
        this.createIndex = createIndex;
    }

    public Integer getModifyIndex() {
        return modifyIndex;
    }

    public void setModifyIndex(Integer modifyIndex) {
        this.modifyIndex = modifyIndex;
    }

    public Integer getLockIndex() {
        return lockIndex;
    }

    public void setLockIndex(Integer lockIndex) {
        this.lockIndex = lockIndex;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KV [createIndex=" + createIndex + ", modifyIndex=" + modifyIndex + ", lockIndex=" + lockIndex + ", key=" + key +
                        ", flags=" + flags + ", value=" + value + "]";
    }
}
