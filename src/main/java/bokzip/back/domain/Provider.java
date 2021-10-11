package bokzip.back.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Provider {
    GOOGLE("ROLE_GOOGLE", "구글"),
    KAKAO("ROLE_KAKAO", "카카오");

    private final String key;
    private final String title;
}
