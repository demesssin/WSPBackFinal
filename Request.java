package WSPBackFinal;
import java.io.*;
import java.util.Date;

class Request extends Post {
    private boolean isSigned;

    public Request(Date date, String content, User author, boolean isSigned) {
        super(date, content, author);
        this.isSigned = isSigned;
    }

    public boolean isSigned() {
        return isSigned;
    }

    public void setSigned(boolean signed) {
        isSigned = signed;
    }
}

