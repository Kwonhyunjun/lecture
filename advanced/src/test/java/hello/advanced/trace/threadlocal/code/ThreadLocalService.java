package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadLocalService {

    private ThreadLocal<String> nameScore = new ThreadLocal<>();

    public String logic(String name){
        log.info("저장 name={} -> nameStore={}", name, nameScore.get());
        nameScore.set(name);
        sleep(1000);
        log.info("조회 nameStore={}", nameScore.get());
        return nameScore.get();
    }

    private void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
