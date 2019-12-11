package behavioral.chain.abstractlogger;

/**
 * @ClassName ConsoleLogger
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 16:53
 **/
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Console::Logger: " + msg);
    }
}
