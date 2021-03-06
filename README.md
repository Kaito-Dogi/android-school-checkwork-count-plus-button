# チェックワーク 〜カウントアプリでプラスボタンを実装しよう〜

## アプリのキャプチャ
https://user-images.githubusercontent.com/49048577/148199977-128a69db-c670-45eb-bb07-6bd618fd8ec7.mp4

## 手順
0. View Binding の設定をしよう
1. `Button` を配置して、idを `plus_button` と設定しよう
1. Int型の変数 `count` を宣言して、初期値として0を代入しよう
1. `plus_button` に `setOnClickListener` メソッドを実装して、 `plus_button` を押すたびに `count` の値を1増やそう

## 確認したいこと

### Android Studioの使い方

1. 新規プロジェクトを作成できたか
1. Androidのプロジェクト構造を理解しているか
    - ktファイル、layoutファイルの場所が分かったか・発見できたか
    - ktファイル、layoutファイルを開けたか
    - ktファイル、layoutファイルを切り替えられたか
1. Buildできたか
    - `Run 'app'` ボタンを押せたか
1. ログを確認できたか
    - `Logcat` を開けたか
    - 優先度（ `Error` など）を切り替えられたか
    - 検索機能を利用したか
    - `Log` クラスを利用してログを出力できたか

### レイアウトの作成

1. layoutファイルを開けたか
1. `View` を配置できたか
    - `Button`
    - `TextView`
1. `View` のidを設定できたか
    - `snake_case`で定義したか
1. 必要なプロパティを設定できたか
    - 検索機能を利用したか

### プログラムの作成
1. 変数を宣言できたか
    - `val` と `var` の違いを理解しているか
    - 型を明記したか
    - `=` を用いて、初期値を代入したか
    - Null許容型と非Null型の違いを理解しているか
1. `setOnClickListener` を実装できたか
    - コードのブロック（ `{}` ）を理解しているか
1. `=` を用いて、変数に値を再代入できたか
1. 型変換
    - `toString()` メソッドを使えたか
    - 型変換が必要な理由を説明できるか
1. `TextView` に表示されている文字列を更新できたか
    - `text` プロパティにアクセスできたか
    - `setText()` メソッドを利用できたか

## 次のステップへのキーワード

- `class`
- `Activity`
- 継承
- `onCreate` メソッド（ `Lifecycle` ）
- `setContentView` メソッド
- `View Binding`
- ラムダ式
etc...
