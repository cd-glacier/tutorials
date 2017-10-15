//
//  Audio.swift
//  GoBird
//
//  Created by Takuto Nakamura on 2017/08/21.
//  Copyright © 2017年 CATK. All rights reserved.
//

import AVFoundation

//音声を鳴らすためのクラス
class Audio {
	var audioPlayer = AVAudioPlayer()

	//指定した音声ファイルを読み込んで再生の準備
	func set(named: String, volume: Float) {
		let path = Bundle.main.path(forResource: named, ofType: "mp3")!
		let url = URL(fileURLWithPath: path)
		do {
			audioPlayer = try AVAudioPlayer(contentsOf: url)
			audioPlayer.volume = volume
			audioPlayer.prepareToPlay()
		} catch {
			Swift.print("error")
		}
	}

	//音声ファイル再生
	func play() {
		audioPlayer.play()
	}
}

