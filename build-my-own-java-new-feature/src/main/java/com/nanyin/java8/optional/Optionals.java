package com.nanyin.java8.optional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * Optional是可以整洁的防止空指针异常，Option就是一个容器类，里面的内容可以为null，也可以为 not-null,
 * 以前返回null值的都可以使用Optional进行替代。
 *
 * @author gaoguoxing
 * @version 1.0
 * @date 2020-11-23
 */
public class Optionals {
    public static Optional<Long> createEmptyOptional(CreateTypeEnum typeEnum, Long value) {
        if (CreateTypeEnum.EMPTY.equals(typeEnum)) {
            return Optional.empty();
        }
        if (CreateTypeEnum.STATIC_OF.equals(typeEnum)) {
            return Optional.of(value);
        }
        if (CreateTypeEnum.STATIC_OF_NULLABLE.equals(typeEnum)) {
            return Optional.ofNullable(value);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Long> emptyOptional = createEmptyOptional(CreateTypeEnum.EMPTY, null);
        boolean present = emptyOptional.isPresent();
//        Long value = emptyOptional.get();
        System.out.println("emptyOptional is present ? " + present);
        Long orElseGet = createEmptyOptional(CreateTypeEnum.STATIC_OF_NULLABLE,5L).orElse(1L);
        System.out.println("orElseGet : " + orElseGet);

        createEmptyOptional(CreateTypeEnum.STATIC_OF, null).ifPresent(System.out::println);
    }
}
