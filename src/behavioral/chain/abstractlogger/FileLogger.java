package behavioral.chain.abstractlogger;

/**
 * @ClassName FileLogger
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 16:56
 **/
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("File::Logger: " + msg);
    }
}
