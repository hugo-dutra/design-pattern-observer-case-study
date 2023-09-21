package singleton.logger.interfaces;

import singleton.logger.enums.LogLevelEnum;
import java.util.List;

public interface Logger {
    String buildLogMessage(String message, LogLevelEnum level) ;
    void log(String message, LogLevelEnum level);
    void printLogList();
    List<String> getLogList() ;

}
