// Copyright (C) 2011 - Will Glozer.  All rights reserved.

package com.lambdaworks.redis.protocol;

/**
 * Keyword modifiers for redis commands.
 * 
 * @author Will Glozer
 */
public enum CommandKeyword {
    AFTER, AGGREGATE, ALPHA, AND, ASC, BEFORE, BY, COUNT, DESC, ENCODING, FLUSH, GETNAME, IDLETIME, KILL, LEN, LIMIT, LIST, LOAD, MATCH, MAX, MIN, NO, NOSAVE, NOT, ONE, OR, PAUSE, REFCOUNT, RESET, REWRITE, RESETSTAT, SETNAME, STORE, SUM, WEIGHTS, WITHSCORES, XOR, REMOVE;

    public byte[] bytes;

    private CommandKeyword() {
        bytes = name().getBytes(LettuceCharsets.ASCII);
    }
}
