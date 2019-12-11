package behavioral.chain.abstractlogger;

/**
 * @ClassName ErrorLogger
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 16:55
 **/
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Error Console::Logger: " + msg);
    }
}
