package cn.teamwang.elk.log;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Jacky
 * Date: 2019/10/15 16:37
 */
@Slf4j
public class DebugLog {


    public void output() {
        log.info("info hahaha");
        log.debug("debug hahaha");
    }
}
