package cn.rainss.emoji;

import com.esotericsoftware.minlog.Log;
import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiPlainText;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

/**
 * 雨落凋殇
 * @since 2020/01/14
 */
public class RainsGitEmojiMain extends CompletionContributor {
    // 构造方法
    public RainsGitEmojiMain(){
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(PsiPlainText.class),new CompletionProvider<CompletionParameters>(){

            @Override
            protected void addCompletions(@NotNull CompletionParameters completionParameters, @NotNull ProcessingContext processingContext, @NotNull CompletionResultSet completionResultSet) {
                boolean oneLineMode = completionParameters.getEditor().isOneLineMode();
                //如果输入框为单行输入框，不执行
                if(completionParameters.getEditor().isOneLineMode()){
                    return;
                }
                // 获取输入框中的值
                String message = completionParameters.getEditor().getDocument().getCharsSequence().toString().toLowerCase();
                // 获取
                int offset = completionParameters.getEditor().getCaretModel().getOffset();

                // 如果输入框中的值长度小于2字符，不显示补全2窗口
                if(message.length() < 2){
                    return;
                }
                int pos = Math.max(0, Math.max(message.lastIndexOf(":", offset), message.lastIndexOf(" ", offset)));
                message = message.substring(pos).trim();
                String[] split = message.split("\\s");
                completionResultSet.addElement(LookupElementBuilder.create("test0"));
                completionResultSet.addElement(LookupElementBuilder.create("test1"));
                completionResultSet.addElement(LookupElementBuilder.create("test2"));
                completionResultSet.addElement(LookupElementBuilder.create("test3"));
                completionResultSet.addElement(LookupElementBuilder.create("test4"));
                completionResultSet.addElement(LookupElementBuilder.create("test5"));
                completionResultSet.addElement(LookupElementBuilder.create("test6"));
                completionResultSet.addElement(LookupElementBuilder.create("test7"));
            }
        });
    }
}
