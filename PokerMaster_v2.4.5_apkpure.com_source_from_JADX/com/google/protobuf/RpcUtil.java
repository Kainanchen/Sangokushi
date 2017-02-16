package com.google.protobuf;

public final class RpcUtil {

    /* renamed from: com.google.protobuf.RpcUtil.1 */
    static class C03171 implements RpcCallback<Message> {
        final /* synthetic */ Message val$defaultInstance;
        final /* synthetic */ RpcCallback val$originalCallback;
        final /* synthetic */ Class val$originalClass;

        C03171(Class cls, Message message, RpcCallback rpcCallback) {
            this.val$originalClass = cls;
            this.val$defaultInstance = message;
            this.val$originalCallback = rpcCallback;
        }

        public final void run(Message message) {
            Object obj;
            try {
                obj = (Message) this.val$originalClass.cast(message);
            } catch (ClassCastException e) {
                obj = RpcUtil.copyAsType(this.val$defaultInstance, message);
            }
            this.val$originalCallback.run(obj);
        }
    }

    /* renamed from: com.google.protobuf.RpcUtil.2 */
    static class C03182 implements RpcCallback<ParameterType> {
        private boolean alreadyCalled;
        final /* synthetic */ RpcCallback val$originalCallback;

        C03182(RpcCallback rpcCallback) {
            this.val$originalCallback = rpcCallback;
            this.alreadyCalled = false;
        }

        public final void run(ParameterType parameterType) {
            synchronized (this) {
                if (this.alreadyCalled) {
                    throw new AlreadyCalledException();
                }
                this.alreadyCalled = true;
            }
            this.val$originalCallback.run(parameterType);
        }
    }

    public static final class AlreadyCalledException extends RuntimeException {
        private static final long serialVersionUID = 5469741279507848266L;

        public AlreadyCalledException() {
            super("This RpcCallback was already called and cannot be called multiple times.");
        }
    }

    private RpcUtil() {
    }

    public static <Type extends Message> RpcCallback<Type> specializeCallback(RpcCallback<Message> rpcCallback) {
        return rpcCallback;
    }

    public static <Type extends Message> RpcCallback<Message> generalizeCallback(RpcCallback<Type> rpcCallback, Class<Type> cls, Type type) {
        return new C03171(cls, type, rpcCallback);
    }

    private static <Type extends Message> Type copyAsType(Type type, Message message) {
        return type.newBuilderForType().mergeFrom(message).build();
    }

    public static <ParameterType> RpcCallback<ParameterType> newOneTimeCallback(RpcCallback<ParameterType> rpcCallback) {
        return new C03182(rpcCallback);
    }
}
