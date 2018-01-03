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


