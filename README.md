# Sample Multi Module
1. https://techblog.woowahan.com/2637/
2. https://mangkyu.tistory.com/304






- 실행가능한 jar로 생성하는 옵션, main이 없는 라이브러리에서는 false로 비활성화함
- 스프링 부트 2.0 이상이라면 bootRepackage.enabled를 사용해야 함

- Gradle 에서 compile과 implementation의 차이점
  - `Compile` or `api` 사용 경우
    - 모듈과 직접, 간접적으로 의존하고 있는 모든 라이브러리나 모듈을 재빌드하며, 연결된 모든 모듈의 API가 exposed(노출) 된다.
  - `Implementation` 사용 경우
    - implementation은 모듈을 직접 의존하고있는 모듈만을 재빌드하며, 연결된 API는 노출되지 않는다. (not exposed)

