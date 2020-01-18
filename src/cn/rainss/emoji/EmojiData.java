package cn.rainss.emoji;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashMap;
import java.util.Map;

public class EmojiData {
    public static Map<String, String> emojiToChinese;
    public static Map<String, String> emojiToEnglish;

    public EmojiData() {
        emojiToChinese = new HashMap<String, String>() {{
            put("art", "改进结构和代码格式");
            put("zap", "优化性能");
            put("fire","移除代码或文件");
        }};
        emojiToEnglish = new HashMap<String, String>() {{
            put("art","Improving structure. format of the code.");
            put("zap","Improving performance.");
            put("art","Removing code or files.");
        }};
    }
}
