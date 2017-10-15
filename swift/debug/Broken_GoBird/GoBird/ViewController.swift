//
//  ViewController.swift
//  GoBird
//
//  Created by Takuto Nakamura on 2017/08/21.
//  Copyright © 2017年 CATK. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

	@IBOutlet weak var background: UIImageView!
	@IBOutlet weak var scoreLabel: UILabel!
	@IBOutlet weak var bird: UIImageView!
	@IBOutlet weak var gameoverLabel: UILabel!
	@IBOutlet weak var retryBtn: UIButton!


	var screenW: CGFloat = 0
	var screenH: CGFloat = 0

	var animeTimer: Timer!
	var pipeTimer: Timer!
	var speed: CGFloat = 0
	var score: Int = 0

	var pipes = [UIImageView]()

	//自作クラスの利用
	let flySound = Audio()
	let hitSound = Audio()

	override func viewDidLoad() {
		super.viewDidLoad()

		//画面サイズの取得
		screenW = UIScreen.main.bounds.width
		screenH = UIScreen.main.bounds.height

		//音の初期化
		flySound.set(named: "fly", volume: 1)
		hitSound.set(named: "hit", volume: 1)

		gameStart()
	}

	override func didReceiveMemoryWarning() {
		super.didReceiveMemoryWarning()
	}

	//初期化する関数
	func gameInitialize() {
		background.frame.origin = CGPoint.zero
		bird.image = UIImage(named: "bird_normal.png")
		bird.center = CGPoint(x: 60, y: screenH / 2)
		speed = 0.2
		score = 0
		scoreLabel.text = String(score)
		for pipe in pipes {
			pipe.removeFromSuperview()
		}
		pipes.removeAll()
		gameoverLabel.isHidden = true
		retryBtn.isHidden = true
	}

	func gameStart() {
		//初期化
        gameInitialize()

		//アニメーションのタイマー
		animeTimer = Timer.scheduledTimer(withTimeInterval: 0.02, repeats: true, block: { (t) in
			//背景のアニメーション
			if self.background.center.x > 0 {
				self.background.center.x -= 3
			} else {
				self.background.center.x = self.screenW
			}

			//鳥のアニメーション
			self.bird.center.y += self.speed
            print(self.bird.center.y)
            if self.bird.center.y < 0 {
				self.bird.center.y = 0
			} else if self.bird.center.y > self.screenH {
				self.gameOver()
			}
			self.speed += 0.2

			//土管のアニメーション
			var del: Bool = false
			for pipe in self.pipes {
				if pipe.frame.origin.x + 70 > 0 {
					pipe.frame.origin.x -= 3
				} else {
                    self.score += 1
					pipe.removeFromSuperview()
					del = true
				}
			}
			if del {
				self.pipes.removeFirst()

				self.scoreLabel.text = String(self.score)
			}

			//鳥と土管の当たり判定
			for pipe in self.pipes {
				if pipe.frame.contains(self.bird.center) {
                    print("hoge")
					self.gameOver()
				}
			}
		})

		//新規土管追加のタイマー
		pipeTimer = Timer.scheduledTimer(withTimeInterval: 1, repeats: true, block: { (t) in
			let pipeH: CGFloat = CGFloat((Int(arc4random()) % 5 + 1) * 100) // 100, 200, 300, 400, 500のどれか
			let pipe = UIImageView()
			pipe.image = UIImage(named: "pipe.png")
			pipe.frame.size = CGSize(width: 70, height: 800)
			pipe.frame.origin = CGPoint(x: self.screenW, y: pipeH)
			self.pipes.append(pipe)
			self.view.addSubview(pipe)

			//レイヤーを手前に移動(新規知識)
			self.view.bringSubview(toFront: self.bird)
			self.view.bringSubview(toFront: self.gameoverLabel)
			self.view.bringSubview(toFront: self.retryBtn)
		})
	}

	func gameOver() {
		animeTimer.invalidate()
		pipeTimer.invalidate()
		hitSound.play()
		bird.image = UIImage(named: "bird_confusion.png")
		gameoverLabel.isHidden = false
		retryBtn.isHidden = false
	}

	@IBAction func tap(_ sender: Any) {
		flySound.play()
		speed = -5
	}

	@IBAction func retry(_ sender: Any) {
		gameStart()
	}
}

