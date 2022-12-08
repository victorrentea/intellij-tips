package victor.training.intellij.speed;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.With;
import reactor.core.publisher.Mono;

public class ReactiveHell {
  public ReactiveHell(Dependency dependency) {
    this.dependency = dependency;
  }

  static class A {
  }

  static class B {
  }

  static class C {
  }

  static class D {
  }

  @Value
  @With
  static class AB {
    public A a;
    public B b;
  }

  @Value
  static class ABC {
    public A a;
    public B b;
    public C c;
  }

  interface Dependency {
    Mono<A> a(int id);

    Mono<B> b(int id);

    Mono<B> b1(A a);

    Mono<C> c(int id);

    Mono<C> c1(A a);

    Mono<C> c2(A a, B b);

    Mono<D> d(int id);

    Mono<A> saveA(A a);

    Mono<Void> auditA(A a1, A a0);
  }

  protected final Dependency dependency;

  @Value // imutable object
  @With // public P10UseCaseContext withA(A newa) { return new P10UseCaseContext(newa, b,c,d); }
  @AllArgsConstructor
  static class P10UseCaseContext {
    int id;
    A a;
    B b;
    C c;
    D d;

    public P10UseCaseContext(int id) { // initial UC parameters
      this(id, null, null, null, null);
    }
  }


  public Mono<P10UseCaseContext> p10_contextPattern(int id) {
    return dependency.a(id).zipWith(dependency.d(id),
                    (a, d) -> new P10UseCaseContext(id).withA(a).withD(d))
            .flatMap(context -> dependency.b1(context.getA()).map(context::withB))
            .flatMap(context -> dependency.c2(context.getA(), context.getB()).map(context::withC));

  }
}
