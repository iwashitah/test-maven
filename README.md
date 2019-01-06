## JFrog Maven Artifactoryプラグイン利用手順

* ### 前提条件は以下の通り
&emsp;1. リリース用リポジトリ名はlibs-snapshot-local  
&emsp;2. スナップショット用リポジトリ名はlibs-release-local  
&emsp;3. pom.xmlの各種パラメータを環境に合わせて設定

* ### 以下のアーティファクトを作成し、Artifactoryにアップロードする
&emsp;1. Javaアプリケーションをビルドしたjarファイル  
&emsp;2. ビルドしたjarファイルは実行可能  
&emsp;3. Javaアプリケーションソースのjarファイル  
&emsp;4. Javaアプリケーションのjavadocのjarファイル  

* ### 利用方法
&emsp;1. GitHubに保存しているソースのクローン  
&emsp;&emsp;`git clone https://github.com/iwahi01/jfrog-maven.git`

&emsp;2. ソースのビルド、デプロイ及びArtifactoryへのアップロード  
&emsp;&emsp;`mvn clean deploy -Durl=ArtifactoryのURL -Dusername=Artifactoryのユーザ -Dpassword=Artifactoryのパスワード -Dbuildnumber=ビルド番号`  

&emsp;&emsp;*Jenkinsで実行する場合のGoals and optionsの指定内容は以下の通り*  
&emsp;&emsp;`clean install -Durl=ArtifactoryのURL -Dbuildnumber=ビルド番号`

&emsp;3. ビルドした実行可能jarファイルを実行する場合は引数には標準出力に出力する文字列を指定して実行  
&emsp;&emsp;`java -jar 実行可能jarファイル.jar 標準出力文字列`  

### ※以下はGradleプラグインとの違い
&emsp;1. ビルド名に日本語(UTF-8)を利用した場合に文字化けする

## 各製品の設定内容

* ### Jenkins
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven01.png)
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven02.png)
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven03.png)
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven04.png)
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven05.png)
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven06.png)
![Jenkins](https://github.com/iwahi01/jfrog-maven/wiki/images/jenkins-maven07.png)

* ### GitLab
![GitLab](https://github.com/iwahi01/jfrog-maven/wiki/images/gitlab-maven01.png)
![GitLab](https://github.com/iwahi01/jfrog-maven/wiki/images/gitlab-maven02.png)
![GitLab](https://github.com/iwahi01/jfrog-maven/wiki/images/gitlab-maven03.png)

* ### Artifactory
![Artifactory](https://github.com/iwahi01/jfrog-maven/wiki/images/artifactory-maven01.png)
![Artifactory](https://github.com/iwahi01/jfrog-maven/wiki/images/artifactory-maven02.png)
![Artifactory](https://github.com/iwahi01/jfrog-maven/wiki/images/artifactory-maven03.png)
![Artifactory](https://github.com/iwahi01/jfrog-maven/wiki/images/artifactory-maven04.png)
![Artifactory](https://github.com/iwahi01/jfrog-maven/wiki/images/artifactory-maven05.png)
![Artifactory](https://github.com/iwahi01/jfrog-maven/wiki/images/artifactory-maven06.png)

* ### Eclipse
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven01.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven02.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven03.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven04.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven05.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven06.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven07.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven08.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven09.png)
![Eclipse](https://github.com/iwahi01/jfrog-maven/wiki/images/eclipse-maven10.png)
