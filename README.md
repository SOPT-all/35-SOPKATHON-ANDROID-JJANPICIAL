### **1. 서비스 이름 및 간단한 소개**

- **서비스 이름 |** < 짠피셜 : 너 짠피셜로 몇 JP야? >
- **서비스 간단한 소개 |**  짠피셜, 전세계 주량의 표준이 되다.

### **2. 주요기능**

- **기능 1 :** 온보딩, 술비티아이(sbti)와 주량을 질문한다.
- **기능 2 :** 메인화면, 술비티아이 결과 + 주량(JP) 수치를 표시한다.
- **기능 3 :** 랭킹메인, 내 주량의 파트 내 랭킹과 전체 랭킹을 확인한다.
- **기능 4 :** 랭킹상세, 파트별 랭킹 상세를 확인한다.

### **3. 팀원 역할 분담**

- **온보딩 :** `민재`
- **메인화면 :** `지원`
- **랭킹 메인 :** `민서`
- **랭킹 상세 :** `세훈`

### **4. 컨벤션 규칙과 브랜치 전략**

⚙️ **Code convention**

<img width="1088" alt="image" src="https://github.com/user-attachments/assets/c4cca0b6-603a-4443-94bc-cf763de9ff71">


**🌵 Branch Convention**

```kotlin
기능 단위로 브랜치를 구성합니다. (인당 1개의 피쳐)
- 해당 작업을 위한 브랜치를 파서 작업합니다.
- 작업 완료 후 PR을 날리고 팀원들에게 크로스체크 후 머지합니다.
```

예시)

- feat/minseo
- feat/minjae
- feat/jiwon
- feat/sehun

 **☄️ **Commit Convention**

```kotlin
[feat]     새로운 ui 또는 기능 구현
[chore]    타입 및 변수명 변경, 패키지 구조 변경, 버전 코드 수정 등의 작은 작업
[refactor] 기능적인 수정
[add]      부수적인 코드 추가 및 라이브러리 추가, 새로운 파일 생성
[del]      쓸모없는 코드나 파일 삭제
[fix]      버그 및 오류 해결
[setting]  프로젝트 기초세팅은 이걸로 날리겠습니다.
[docs]     문서 작성 및 수정 (README.md 등)
```

**커밋 날리기 예시**

- **[feat] 버튼 컴포넌트 생성**

### 5. 폴더링

```kotlin
📂 com.sopt.a35_sopkathon_android_android1
┣ 📂 data
┣ 📂 presentation
┃ ┣ 📂 jiwon
┃ ┃ ┣ 📂 
┃ ┃ ┣ 📂 ...
┃ ┣ 📂 main
┃ ┣ 📂 minjae
┃ ┃ ┣ 📂 
┃ ┃ ┣ 📂 ...
┃ ┣ 📂 minseo
┃ ┃ ┣ 📂 
┃ ┃ ┣ 📂 ...
┃ ┣ 📂 sehun
┃ ┃ ┣ 📂 
┃ ┃ ┣ 📂 ...
┃ ┣ 📂 util
```

### **6. 파트 내 협업 방식**

- 최선을 다하기
- 모르는거 있으면 가차없이 질문하기
- 머지 전후로 빌드 돌려서 이상없는지 확인하기

### **7. 안드로이드 팀원들의 사진(before)**

<img width="336" alt="image" src="https://github.com/user-attachments/assets/5c9a35fb-bbd7-473d-9eac-b3552f6e4f38">
