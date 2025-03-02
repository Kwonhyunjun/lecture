package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {

    private String nameScore;

    public String logic(String name){
        log.info("저장 name={} -> nameStore={}", name, nameScore);
        nameScore = name;
        sleep(1000);
        log.info("조회 nameStore={}", nameScore);
        return nameScore;
    }

    private void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
