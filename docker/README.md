MEMO

# Hello World

```
docker run ubuntu:latest /bin/echo "hello world"
```

image name:tag name


# imageの取得

```
docker pull centos:7
```

## オプション

 * -a: 全てのタグ


# iamgeの一覧表示 
```
docker images
```

# imageの詳細確認

```
docker inspect centos:7
```

REPOSITORY:TAGとかIMAGE IDを指定する

# tagをつける

```
docker tag centos:7 glacier/centos:hogehgoe
```

docker hub user name/tag name
って感じの指定をしなければいけない

# imageを削除する

```
docker rmi centos:7
```

REPOSITORY:TAGとかIMAGE IDを指定する

# imageの起動

```
docker run -it --name "test" centos:7 /bin/cal
```

--name "test"

はコンテナの名前をつけることができる。
省略するとランダムなコンテナ名がつけられる

## オプション

 * -i: コンテナの標準入力を開く
 * -t: 端末デバイスをつかう
 * --name: コンテナの名前
 * -d: deamon. バックグラウンドで実行する
 * -rm: 実行完了後に自動でコンテナを削除する

### ポートのマッピング

```
docker run -d -p 8080:80 httpd
```

ホストのポート8080とコンテナのポート80をマッピング

# logを確認する

```
docker logs -t c772d57bbe2d18081b477789
```

image idを指定

## オプション

 * -t: タイムスタンプを確認する

# 稼働しているコンテナの確認

```
docker ps
```

# 稼働しているコンテナの稼働状況の確認

```
docker status [コンテナ識別子]
```

# コンテナの起動

```
docker start [コンテナ識別子]
```

# コンテナの停止

```
docker stop [コンテナ識別子]
```

# コンテナの再起動

```
docker restart [コンテナ識別子]
```

# コンテナの削除

```
docker rm [コンテナ識別子]
```

## コンテナの一括削除

```
docker rm -f "docker ps -a -q"
```

# 稼働しているコンテナへの接続

```
docker attach [コンテナ識別子]
```

接続したコンテナごと終了: CTRL + c
接続しているプロセスのみ終了: CTRL + p -> CTRL + q

# 稼働いているコンテナでプロセスの実行

```
docker exec [コンテナ識別子] [コマンド]
```

# 稼働しているコンテナのプロセス確認

```
docker top [コンテナ識別子]
```

# 稼働しているコンテナのポート確認

```
docker port [コンテナ識別子]
```

# コンテナの名前変更

```
docker rename [old_name] [new_name]
```

# コンテナからimageの作成

```
docker commit [コンテナ識別子] [image_name:tag_name]
```



