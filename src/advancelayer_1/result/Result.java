package advancelayer_1.result;

/**
 * 类名:     SearchResult
 * 描述:
 * 隶属于:   成绩管理
 * 建立事件： 2022/4/8
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Result<E> implements ResultInterface<E> {
    E result;
    boolean OK = false;

    public Result(boolean OK, E result) {
        this.OK = OK;
        this.result = result;
    }
    public Result(E result) {
        this.OK = result != null;
        this.result = result;
    }

    @Override
    public boolean isOK() {
        return OK;
    }

    @Override
    public E getResult() {
        return result;
    }
}
