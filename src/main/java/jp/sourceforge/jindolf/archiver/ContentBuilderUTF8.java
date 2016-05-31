package jp.sourceforge.jindolf.archiver;

import jp.sourceforge.jindolf.parser.ContentBuilderUCS2;
import jp.sourceforge.jindolf.parser.DecodeException;

/**
 * ContentBuilderUCS2と違ってサロゲートペアをエラー扱いにしない。
 */
public class ContentBuilderUTF8 extends ContentBuilderUCS2 {
    public ContentBuilderUTF8() {
        super();
    }
    
    public ContentBuilderUTF8(int capacity) throws NegativeArraySizeException {
        super(capacity);
    }
    
    public void charContent(CharSequence seq) throws DecodeException {
        this.flushError();
        this.getContent().append(seq);
    }
}
